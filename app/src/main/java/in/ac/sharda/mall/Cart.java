package in.ac.sharda.mall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import cz.msebera.android.httpclient.Header;

public class Cart extends AppCompatActivity {
    TextView countt;
    Button checkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        countt=(TextView)findViewById(R.id.tc);
        checkout=(Button)findViewById(R.id.check);
        final Bundle extras=getIntent().getExtras();
        countt.setText(extras.get("count").toString());
        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Cart.this,checkOut.class);
                i.putExtra("final_checkout",extras.get("checkout").toString());
                startActivity(i);
            }
        });
    }
}
