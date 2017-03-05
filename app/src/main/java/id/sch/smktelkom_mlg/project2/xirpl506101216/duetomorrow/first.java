package id.sch.smktelkom_mlg.project2.xirpl506101216.duetomorrow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class first extends AppCompatActivity {

    private Button setuju;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        setuju = (Button) findViewById(R.id.agree);

        setuju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(first.this, Splash.class);
                startActivity(intent);
                first.this.finish();
            }
        });
    }
}
