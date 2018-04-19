package fcu.lab20180419;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText month;
    private EditText date;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        month = (EditText) this.findViewById(R.id.et_month);
        date = (EditText) this.findViewById(R.id.et_date);
        submit = (Button) this.findViewById(R.id.btn_star);

        submit.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int_Month = Integer.parseInt(month.getText().toString());
                int int_Date = Integer.parseInt(date.getText().toString());

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, HoroscopeActivity.class);
                //intent.putExtra(KEY_MONTH,int_Month);
                //intent.putExtra(KEY_DAY,int_Date);
                startActivity(intent);
            }

        });


    }
}
