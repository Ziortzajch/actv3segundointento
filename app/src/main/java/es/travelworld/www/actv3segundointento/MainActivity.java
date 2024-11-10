package es.travelworld.www.actv3segundointento;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.google.android.material.snackbar.Snackbar;

import es.travelworld.www.actv3segundointento.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        DataBindingUtil.setContentView(this,R.layout.activity_main);
        Usuario usuario=new Usuario(binding.textLogin.getText().toString(),binding.textPassword.getText().toString());
        binding.setUser(usuario);

        binding.btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textLogin.getText().toString();
                binding.textPassword.getText().toString();
                Snackbar.make(view,"Has hecho login".toString(),Snackbar.LENGTH_LONG).show();

            }
        });

        binding.btCreateNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"Pronto se implementaran estas funciones".toString(), Snackbar.LENGTH_LONG).show();

            }
        });
        binding.btGetNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"Pronto se implementaran estas funciones".toString(), Snackbar.LENGTH_LONG).show();
            }
        });
    }
}