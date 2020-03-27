package id.ac.polinema.aplikasiproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import id.ac.polinema.aplikasiproject.models.Session;
import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameInput;
    private EditText passwordInput;
    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        session = Application.getSession();
        usernameInput = findViewById(R.id.id_username);
        passwordInput = findViewById(R.id.id_password);
        if (session.isKeepUsername()) {
            usernameInput.setText(session.getUsername());
        }
    }

    public void handlereset(View view) {
        usernameInput.setText("");
        passwordInput.setText("");
    }

    public void handleLogin(View view) {
        String username = usernameInput.getText().toString();
        String password = passwordInput.getText().toString();

        boolean success = session.validate(username, password);
        if (success) {
            if (session.isKeepUsername()) {
                session.setUsername(username);
            }
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        } else {
            Snackbar.make(view, "Authentication Failed", Snackbar.LENGTH_SHORT).show();
        }
    }
}
