package com.example.mycalculator;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private TextView Screen;
   private Button AC,Power,Back,Div,Mult,Sub,Add,One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Zero,Ans,Equal,Point;
   private String input,Answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.mylayout);


        Screen = findViewById(R.id.calc_screen);
        AC = findViewById(R.id.btn_allclear);
        Power = findViewById(R.id.btn_power);
        Back = findViewById(R.id.btn_back);
        Div = findViewById(R.id.btn_divi);
        Mult = findViewById(R.id.btn_mult);
        Add = findViewById(R.id.btn_add);
        Sub = findViewById(R.id.btn_sub);
        One = findViewById(R.id.btn_one);
        Two = findViewById(R.id.btn_two);
        Three = findViewById(R.id.btn_three);
        Four = findViewById(R.id.btn_four);
        Five = findViewById(R.id.btn_five);
        Six = findViewById(R.id.btn_six);
        Seven = findViewById(R.id.btn_seven);
        Eight = findViewById(R.id.btn_eight);
        Nine = findViewById(R.id.btn_nine);
        Zero = findViewById(R.id.btn_zero);
        Ans = findViewById(R.id.btn_six);
        Equal = findViewById(R.id.btn_equal);
        Point = findViewById(R.id.btn_dot);

        One.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
              //  Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,NewActivity.class);
                startActivity(intent);
                return false;
            }
        });

        }

        public void ButtonClick(View view){
        Button button = (Button) view;
        String data = button.getText().toString();
        switch(data){
            case"AC":
                input="";
                break;
            case"Ans":
                input+=Answer;
                break;
            case"*":
                Solve();
                input+="*";
                break;
            case"^":
                Solve();
                input+="^";
                break;
            case"=":
                Solve();
                Answer = input;
                break;
            case"X":
                    String newText = input.substring(0,input.length()-1);
                    input = newText;
                    onStop();
                break;
            default:
                if(input==null){
                    input="";
                }
                if(data.equals("+")||data.equals("-")||data.equals("/")){
                    Solve();
                }
                input+=data;

        }
        Screen.setText(input);
        }

        private void Solve(){

        if(input.split("\\*").length==2){
            String number[]=input.split("\\*");
            try{
                double mul=Double.parseDouble(number[0])*Double.parseDouble(number[1]);
                input=mul+"";
            }
            catch (Exception e){
                //Toggle error

            }
        }
        else if(input.split("/").length==2){
            String number[]=input.split("/");
            try {
                double div = Double.parseDouble(number[0])/Double.parseDouble(number[1]);
                input=div+"";
            }
            catch (Exception e){
                //Toggle error
            }
        }
        else if(input.split("\\^").length==2){
            String number[]=input.split("\\^");
            try {
                double pow = Math.pow(Double.parseDouble(number[0]),Double.parseDouble(number[1]));
                input=pow+"";
            }
            catch (Exception e){
                //Toggle error
            }
        }
        else if(input.split("\\+").length==2){
            String number[]=input.split("\\+");
            try {
                double sum = Double.parseDouble(number[0])+Double.parseDouble(number[1]);
                input=sum+"";
            }
            catch (Exception e){
                //Toggle error
            }
        }
        else if(input.split("\\-").length>1){
            String number[]=input.split("\\-");
            //for neg no like -5-8
           /* if(number[0]=="" && number.length==2){
                number[0]=0+"";
            }*/
            try {
                double sub = 0;
                if (number.length == 2) {
                    sub = Double.parseDouble(number[0]) - Double.parseDouble(number[1]);

                }
                else if(number.length == 3){
                    sub = Double.parseDouble(number[1]) - Double.parseDouble(number[2]);
                }
                input = sub + "";
            }
            catch (Exception e){
                //Toggle error
            }
        }
        //To remove .0 from ans like 9.0 to 9
        String n[]=input.split("\\.");
        if(n.length>1){
            if(n[1].equals("0")){
                input=n[0];
            }
        }
        Screen.setText(input);
        }



    }
