package thannvph03341.cardviewrecyview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<Model1> model1s = new ArrayList<>();
        model1s.add(new Model1("Nông Văn Thân", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        model1s.add(new Model1("Phan Duy Thái", 26));
        AdapterRecyclerView adapterRecyclerView = new AdapterRecyclerView(this, model1s);
        recyclerView.setAdapter(adapterRecyclerView);
    }
}
