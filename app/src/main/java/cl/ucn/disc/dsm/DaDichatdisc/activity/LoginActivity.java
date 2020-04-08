package cl.ucn.disc.dsm.DaDichatdisc.activity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cl.ucn.disc.dsm.DaDichatdisc.R;
import cl.ucn.disc.dsm.DaDichatdisc.activity.session.UserSession;
import cl.ucn.disc.dsm.DaDichatdisc.viewModel.Service.ConnectionHandler;
import es.dmoral.toasty.Toasty;


public class LoginActivity extends AppCompatActivity {

    EditText editTextEmail, editTextPassword;
    Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*
        Email container
         */
        editTextEmail = findViewById(R.id.editEmail);
        /*
        Password container
         */
        editTextPassword = findViewById(R.id.editPassword);
        /*
        Button who send the request to login
         */
        btnLogin = findViewById(R.id.btnLogin);
        /*
        Button who will open a new activity to register
         */
        btnRegister = findViewById(R.id.btnRegister);


    }
}

