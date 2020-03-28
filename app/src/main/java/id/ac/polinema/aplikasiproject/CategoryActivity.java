package id.ac.polinema.aplikasiproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import id.ac.polinema.aplikasiproject.models.A;
import id.ac.polinema.aplikasiproject.models.Category;

public class CategoryActivity extends AppCompatActivity {


    private TextView welcomeText;
    private RecyclerView categoryView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        welcomeText = findViewById(R.id.text_welcome);
        categoryView = findViewById(R.id.rv_categories);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        categoryView.setLayoutManager(layoutManager);


    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
