package ddm.fatec.com.br.appinitialgit;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private Button botao1;
    private Button botao2;
    private Button botao3;
    private Button botao4;
    private Button botao5;
    private Button botao6;
    private Button botaoProf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        botaoProf = (Button) findViewById(R.id.btnProf);

        botao1 = (Button) findViewById(R.id.btnTuri);
        botao2 = (Button) findViewById(R.id.btnGabi);
        botao3 = (Button) findViewById(R.id.btnGui);
        botao4 = (Button) findViewById(R.id.btnJulio);
        botao5 = (Button) findViewById(R.id.btnDalfito);
        botao6 = (Button) findViewById(R.id.btnSamuel);

        botaoProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
