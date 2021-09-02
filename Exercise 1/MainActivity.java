package com.example.mobile1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

   }
   @SuppressWarnings("deprecation")
   public void setDate(View view) {
       showDialog(999);
       Toast.makeText(getApplicationContext(), "ca",
               Toast.LENGTH_SHORT)
               .show();
   }

}
