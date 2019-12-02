package UMS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ussd.R;

public class UMS extends AppCompatActivity {
ListView listView;
    ArrayAdapter <String> MyArrayList;
    String[] U = {"USSD KODLAR", "INTERNET", "TARIF REJALAR", "YANGILIKLAR", "XIZMATLAR", "MULOQOT", "KONTENT XIZMATLAR", "OPERATOR BILAN ALOQA", "AKSIYA VA CHEGIRMALAR"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ums);
        listView = findViewById(R.id.listView);
        MyArrayList = new ArrayAdapter <String> (UMS.this, android.R.layout.simple_list_item_1, U);
        listView.setAdapter(MyArrayList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(UMS.this, "Salom Shox!", Toast.LENGTH_SHORT).show();
                switch (position){
                    case 0:
                        Intent i = new Intent(UMS.this, USSD_kodlar.class);
                        startActivity(i);
                }
            }
        });
    }
}
