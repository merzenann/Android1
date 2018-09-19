package com.example.merzensumagaysay.mynavigationdrawer;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        tv = (TextView) findViewById(R.id.tv);

        for (int i = 0; i < CustomAdapterGuideA.modelArrayList.size(); i++){
            if(CustomAdapterGuideA.modelArrayList.get(i).getSelected()) {
                tv.setText(tv.getText() + " " + CustomAdapterGuideA.modelArrayList.get(i).getInstruct());
            }
        }
    }
}
