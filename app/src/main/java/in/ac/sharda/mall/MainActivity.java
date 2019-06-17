package in.ac.sharda.mall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {
    EditText user_name,user_password;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user_name=(EditText)findViewById(R.id.userId);
        user_password=(EditText)findViewById(R.id.userPassword);
        submit=(Button)findViewById(R.id.login);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(user_name.getText().toString()))
                {
                    user_name.setError("Enter User-Name");
                }
                if(TextUtils.isEmpty(user_password.getText().toString()))
                {
                    user_password.setError("Enter password");
                }
                else
                {
                   if((user_name.getText().toString().equals("Nishant")&& user_password.getText().toString().equals("Nishant@123"))||(user_name.getText().toString().equals("Siddharth")&& user_password.getText().toString().equals("Siddharth@123"))||(user_name.getText().toString().equals("Sandeep")&& user_password.getText().toString().equals("Sandeep@123"))||(user_name.getText().toString().equals("Shubham")&& user_password.getText().toString().equals("Shubham@123")))
                   {
                       Intent i=new Intent(MainActivity.this, Laptoplist.class);
                       startActivity(i);
                   }
                   else
                   {
                       submit.setEnabled(false);
                   }
                }
            }
        });
    }
}
