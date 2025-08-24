package com.zybooks.inventoryorganizer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class InventoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button addButton;
    DBHelper db;
    ArrayList<Item> itemList;
    InventoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        recyclerView = findViewById(R.id.recyclerViewInventory);
        addButton = findViewById(R.id.buttonAddItem);
        db = new DBHelper(this);

        itemList = db.getItems();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new InventoryAdapter(itemList);
        recyclerView.setAdapter(adapter);

        // Handle Update/Delete
        adapter.setOnItemClickListener(new InventoryAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Item oldItem = itemList.get(position);
                db.updateItem(oldItem, oldItem.getName() + " (Updated)", oldItem.getQuantity() + 1);
                refreshList();
            }

            @Override
            public void onItemLongClick(int position) {
                Item itemToDelete = itemList.get(position);
                db.deleteItem(itemToDelete);
                refreshList();
            }
        });

        // Add new item
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.insertItem("New Item", 1);
                refreshList();
            }
        });
    }

    private void refreshList() {
        itemList.clear();
        itemList.addAll(db.getItems());
        adapter.notifyDataSetChanged();
    }
}
