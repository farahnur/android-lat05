package id.ac.poliban.dts.farah.latihan05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAjax = findViewById(R.id.btAjax);
        Button btFiorentina = findViewById(R.id.btFiorentina);
        Button btRealMadrid = findViewById(R.id.btRealMadrid);

        //event handler
        btAjax.setOnClickListener(v -> Toast.makeText(this, "Hi Ajax!", Toast.LENGTH_SHORT).show());
        btFiorentina.setOnClickListener(v -> Toast.makeText(this, "Hi Fiorentina!", Toast.LENGTH_SHORT).show());
        btRealMadrid.setOnClickListener(v -> Toast.makeText(this, "Hi Real Madrid!", Toast.LENGTH_SHORT).show());
    }
}
