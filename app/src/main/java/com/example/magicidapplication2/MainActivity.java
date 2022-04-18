      package com.example.magicidapplication2;

      import android.os.Bundle;
      import android.support.v7.app.AppCompatActivity;
      import android.view.View;
      import android.widget.Button;
      import android.widget.EditText;
      import android.widget.TextView;

      import java.text.BreakIterator;

      public class MainActivity extends AppCompatActivity {
      //public class MainActivity implements Ovrride {

      EditText etID;
      Button btnSubmit;
      TextView tvResult;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_activity);

            etID =  (EditText) findViewById(R.id.etID);
            btnSubmit = (Button)findViewById(R.id.btnSubmit);
            tvResult = (TextView)findViewById(R.id.tvResults);

      tvResult.setVisibility(View.GONE);

      btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                  BreakIterator etID = null;
                  String idNumber = etID.getText().toString().trim();

         String dob = idNumber.substring(0 , 6);

         int gender = Integer.parseI      nt(Character.toString(idNumber.charAt(6)));

         String sGender;

         if (gender < 5 )
               sGender = "Female" ;
          else sGender= "Male" ;

          int nationality = Integer.parseInt(Character.toString(idNumber.charAt(10)));

          String sNationality;
          if (nationality == 0)
                sNationality = String.valueOf((R.string.sacit));
          else
                sNationality = getString(R.string.permanent);

String text = "Date of birth : " + dob + getString(R.string.newline)
        + "Gender : " + sGender + "\n" + getString(R.string.nationality) + sNationality;

          tvResult.setText(text);

          tvResult.setVisibility(View.VISIBLE);
         }

      });


      }
}

