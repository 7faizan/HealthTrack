package c.singularities.healthtrack;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LsActivity extends AppCompatActivity {

    GridView g;
    String[] numword = {"planck", "Svenson", "Indigo", "Hayden", "Arhaus", "Hahn", "France & Son", "Tommy Bahama", "Samson", "Ocean Club"};
    int[] images = {R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        g = findViewById(R.id.gg);
        MainAdapter adapter = new MainAdapter(LsActivity.this, numword, images);
        g.setAdapter(adapter);
        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You clicked " + numword[+position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}