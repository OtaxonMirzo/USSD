package UMS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ussd.R;

public class USSD_kodlar extends AppCompatActivity {
ListView listView;
ArrayAdapter <String> MyArrayList;
String[] U = {"IMEI KODINI TEKSHIRISH *#06#", "BALANSNI TEKSHIRISH *100#", "TRAFIK QOLDIG'INI TEKSHIRISH *102#", "DAQIQA TO'PLAMLARI UCHUN *103#", "MENING RAQAMIM *150#", "MENING HIZMATLARIM *140#", "4G LTE NI YOQISH *222*1#", "MENIGN RAQAMLARIM *151#", "OXIRGI TO'LOV *111*015#", "REKLAMANI TAQIQLASH", "SMS QOLDIG'INI TEKSHIRISH *104#", "MENING XARAJATLARIM *111*025#", "ALOHIDA TOIFADAGI RAQAM UCHUN QARZDORLIKNI TEKSHIRISH *152#", "GOODO'K HIZMATINI O'CHIRISH *111*0140#", "TUNGI MB QOLDIG'INI TEKSHIRISH *203#", "VADA QILINGAN TO'LOV QOLDIG'INI TEKSHIRISH *111*320#"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ussd_kodlar);
        listView = findViewById(R.id.listView);
        MyArrayList = new ArrayAdapter <String> (USSD_kodlar.this, android.R.layout.simple_list_item_1, U);
        listView.setAdapter(MyArrayList);
    }
}
