package com.example.merzensumagaysay.mynavigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class GuidelinesAdmin extends AppCompatActivity {

    private ListView lv;
    private ArrayList<ModelGuidelines> modelArrayList;
    private CustomAdapterGuideA customAdapterGuideA;
    private Button btnnext;
    private  String[] instruclist = new String[]{"try1", "try2", "try3", "try4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidelines_admin);
        lv = (ListView) findViewById(R.id.lv);
        btnnext = (Button) findViewById(R.id.sendinstruct);

        modelArrayList = getModel(false);
        customAdapterGuideA = new CustomAdapterGuideA(this,modelArrayList);
        lv.setAdapter(customAdapterGuideA);


        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuidelinesAdmin.this,NextActivity.class);
                startActivity(intent);
            }
        });


    }

    private ArrayList<ModelGuidelines> getModel(boolean isSelect){
        ArrayList<ModelGuidelines> list = new ArrayList<>();
        for(int i = 0; i < 4; i++){

            ModelGuidelines model = new ModelGuidelines();
            model.setSelected(isSelect);
            model.setInstruct(instruclist[i]);
            list.add(model);
        }
        return list;
    }

}

