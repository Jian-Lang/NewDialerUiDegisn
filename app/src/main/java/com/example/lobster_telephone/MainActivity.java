package com.example.lobster_telephone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnStar,btnJing,btnCall,btnDel;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setBackgroundDrawableResource(R.drawable.background);
        AlertDialog.Builder alter = new AlertDialog.Builder(this);
        alter.setTitle("重要提示：");
        alter.setMessage("第一次打开本APP时，在设置中，给本APP通话权限方可正常使用！");
        alter.setCancelable(false);
        alter.setPositiveButton("收到", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                  // nothing will be put here
            }
        });
        alter.show();
        btn0 = (ImageButton) findViewById(R.id.btn0);
        btn0.setOnClickListener(this);
        btn1 = (ImageButton) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (ImageButton) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (ImageButton) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (ImageButton) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = (ImageButton) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = (ImageButton) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn7 = (ImageButton) findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        btn8 = (ImageButton) findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        btn9 = (ImageButton) findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        btnStar = (ImageButton) findViewById(R.id.btnStar);
        btnStar.setOnClickListener(this);
        btnJing = (ImageButton) findViewById(R.id.btnJing);
        btnJing.setOnClickListener(this);
        btnCall = (ImageButton) findViewById(R.id.btnCall);
        btnCall.setOnClickListener(this);
        btnDel = (ImageButton) findViewById(R.id.btnDel);
        btnDel.setOnClickListener(this);
        textView = (TextView) findViewById(R.id.edit_Text);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn0:
                String tmp0 = textView.getText().toString();
                tmp0 = tmp0 + "0";
                textView.setText(tmp0);
                break;
            case R.id.btn1:
                String tmp1 = textView.getText().toString();
                tmp1 = tmp1 + "1";
                textView.setText(tmp1);
                break;
            case R.id.btn2:
                String tmp2 = textView.getText().toString();
                tmp2 = tmp2 + "2";
                textView.setText(tmp2);
                break;
            case R.id.btn3:
                String tmp3 = textView.getText().toString();
                tmp3 = tmp3 + "3";
                textView.setText(tmp3);
                break;
            case R.id.btn4:
                String tmp4 = textView.getText().toString();
                tmp4 = tmp4 + "4";
                textView.setText(tmp4);
                break;
            case R.id.btn5:
                String tmp5 = textView.getText().toString();
                tmp5 = tmp5 + "5";
                textView.setText(tmp5);
                break;
            case R.id.btn6:
                String tmp6 = textView.getText().toString();
                tmp6 = tmp6 + "6";
                textView.setText(tmp6);
                break;
            case R.id.btn7:
                String tmp7 = textView.getText().toString();
                tmp7 = tmp7 + "7";
                textView.setText(tmp7);
                break;
            case R.id.btn8:
                String tmp8 = textView.getText().toString();
                tmp8 = tmp8 + "8";
                textView.setText(tmp8);
                break;
            case R.id.btn9:
                String tmp9 = textView.getText().toString();
                tmp9 = tmp9 + "9";
                textView.setText(tmp9);
                break;
            case R.id.btnStar:
                String tmpStar = textView.getText().toString();
                tmpStar = tmpStar + "*";
                textView.setText(tmpStar);
                break;
            case R.id.btnJing:
                String tmpJing = textView.getText().toString();
                tmpJing = tmpJing + "#";
                textView.setText(tmpJing);
                break;
            case R.id.btnDel:
                String tmpDel = textView.getText().toString();
                if(tmpDel.equals("")){

                }
                else{
                    tmpDel = tmpDel.substring(0,tmpDel.length()-1);
                    textView.setText(tmpDel);
                }
                break;
            case R.id.btnCall:
                Toast.makeText(MainActivity.this,"正为您跳转到拨号页面",Toast.LENGTH_SHORT).show();
                String phoneNum = textView.getText().toString();
                textView.setText("");
                Intent intent = new Intent(Intent.ACTION_CALL);
                Uri.parse("tel:" + phoneNum);
                intent.setData(Uri.parse("tel:" + phoneNum));
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
