package hr.ferit.maja.rma_zadaca;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton billgates = findViewById(R.id.Picture1);

        billgates.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast notification = Toast.makeText(MainActivity.this, R.string.billgatesquote, Toast.LENGTH_LONG);
                notification.show();
            }
        }));

        ImageButton elonmusk = findViewById(R.id.Picture2);

        elonmusk.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast notification = Toast.makeText(MainActivity.this, R.string.elonmuskquote, Toast.LENGTH_LONG );
                notification.show();
            }
        }));

        ImageButton markzuckerberg = findViewById(R.id.Picture3);

        markzuckerberg.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast notification = Toast.makeText(MainActivity.this, R.string.markzuckquote, Toast.LENGTH_LONG );
                notification.show();
            }
        }));
    }


    @Override
    public void onClick(View view) {

    }
}
