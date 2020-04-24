package vn.edu.ntu.phuquockhanh.phuquockhanh1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtName,edtDate,edtSothichKhac;
    RadioGroup rdgSex,rdgLike;
    RadioButton rdbNam,rdbNu;
    CheckBox cbFilm,cbCaffe,cbHome,cbMusic,cbCook;
    Button btXacnhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddView();
        AddEvent();
    }
    private void AddView (){
        edtName = findViewById(R.id.edtName);
        edtDate = findViewById(R.id.edtDate);
        rdgSex = findViewById(R.id.rdgSex);
        rdbNam = findViewById(R.id.rdbNam);
        rdbNu = findViewById(R.id.rdbNu);
        rdgLike = findViewById(R.id.rdbLike);
        cbFilm = findViewById(R.id.cbFilm);
        cbCaffe = findViewById(R.id.cbHome);
        cbMusic = findViewById(R.id.cbMusic);
        cbHome = findViewById(R.id.cbHome);
        cbCook = findViewById(R.id.cbCook);
        edtSothichKhac = findViewById(R.id.edtSoThichKhac);
        btXacnhan = findViewById(R.id.btXacnhan);
    }
    private void AddEvent(){

        btXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KetQua();
            }
        });

    }
    private void KetQua(){
        String name = edtName.getText().toString();
        String date = edtDate.getText().toString();
        String Sex = "";
        StringBuffer Likes = new  StringBuffer();
        //Giới Tính
        if (rdbNam.isChecked())
        {
            Sex = "Nam";
        }
        else
        {
            Sex = "Nữ";
        }
        //Sở Thích
        if (cbFilm.isChecked())
        {
            Likes.append(cbFilm.getText().toString());
        }
        if (cbMusic.isChecked())
        {
            Likes.append("," +cbMusic.getText().toString());
        }
        if (cbCaffe.isChecked())
        {
            Likes.append("," +cbCaffe.getText().toString());
        }
        if (cbHome.isChecked())
        {
            Likes.append("," +cbHome.getText().toString());
        }
        if (cbCook.isChecked())
        {
            Likes.append("," +cbCook.getText().toString());
        }
        String SoThichKhac = edtSothichKhac.getText().toString();
        Toast.makeText(getApplicationContext(), "" + name + "\nNgày Sinh: " +date +"\n Giới Tính: "+Sex +"\n Sở Thích:"+ Likes+","+SoThichKhac, Toast.LENGTH_SHORT).show();
    }

}
