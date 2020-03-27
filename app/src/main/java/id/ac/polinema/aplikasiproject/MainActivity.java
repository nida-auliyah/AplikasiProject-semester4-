package id.ac.polinema.aplikasiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import id.ac.polinema.aplikasiproject.adapters.CategoryAdapter;
import id.ac.polinema.aplikasiproject.models.A;
import id.ac.polinema.aplikasiproject.models.Category;
import id.ac.polinema.aplikasiproject.models.Session;

public class MainActivity extends AppCompatActivity implements CategoryAdapter.OnItemCategoryListener {

    public static final String CATEGORY_KEY = "CATEGORY";
    public static final String INDEX_KEY = "INDEX";
    public static final int INSERT_REQUEST = 1;
    public static final int UPDATE_REQUEST = 2;

    private TextView welcomeText;
    private RecyclerView categoryView;
    private CategoryAdapter adapter;
    private A account;
    private Session session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new CategoryAdapter(account.getCategory(), this);
        categoryView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        categoryView.setLayoutManager(layoutManager);
    }

    public void handlecontinue(View view) {
        Intent intent = new Intent(this, CategoryActivity.class);
        startActivity(intent);
    }

    @Override
    public void onCategoryClicked(int index, Category item) {
        welcomeText.setText(String.format("Welcome %s", account.getName()));
        Intent intent = new Intent(this, SaveActivity.class);
        intent.putExtra(CATEGORY_KEY, item);
        intent.putExtra(INDEX_KEY, 0);
        startActivityForResult(intent, UPDATE_REQUEST);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
