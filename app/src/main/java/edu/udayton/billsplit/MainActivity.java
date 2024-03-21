package edu.udayton.billsplit;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button button; @Override protected void onCreate(Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    button =findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener()
    {
        @Override public void onClick(View v)
        {
            openActivity();
        }
    });
}
public void openActivity()
{
    Intent intent=new Intent(MainActivity.this,BillActivity.class);
    startActivity(intent);
}
}