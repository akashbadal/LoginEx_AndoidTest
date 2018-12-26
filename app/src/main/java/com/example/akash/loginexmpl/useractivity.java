package com.example.akash.loginexmpl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class useractivity extends AppCompatActivity {

    private static ImageView imageV;
    private static Button btn;

    private int current_index;

    int[] imageArray = {R.drawable.ak_id1_web,R.drawable.akash_id_web,R.drawable.ic_launcher_web };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useractivity);
        image_swap();
    }

    public void  image_swap(){

        imageV =(ImageView)findViewById(R.id.imageView);
        btn =(Button)findViewById(R.id.button2);
        btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View V){
                        current_index ++;
                        current_index = current_index % imageArray.length;
                        imageV.setImageResource(imageArray[current_index]);

                    }
                }
        );

    }


}
