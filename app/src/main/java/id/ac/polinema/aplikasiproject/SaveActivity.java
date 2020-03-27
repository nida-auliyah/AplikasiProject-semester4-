package id.ac.polinema.aplikasiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import id.ac.polinema.aplikasiproject.models.Category;

public class SaveActivity extends AppCompatActivity {

    private EditText categoryInput;
    private Category item;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            item = extras.getParcelable(MainActivity.CATEGORY_KEY);
            index = extras.getInt(MainActivity.INDEX_KEY, 0);
            categoryInput.setText(item.getCategory());
        }
    }

    public void handleSubmit(View view) {
        String category = categoryInput.getText().toString();


        if (category.equals("")){
            Toast.makeText(getApplicationContext(), "Data Harus diisi!",Toast.LENGTH_SHORT).show();
        }else{
            item.setCategory(category);

            Intent intent = new Intent();
            intent.putExtra(MainActivity.CATEGORY_KEY, item);
            intent.putExtra(MainActivity.INDEX_KEY, index);
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}
