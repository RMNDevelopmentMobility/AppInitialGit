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

        botao1 = (Button) findViewById(R.id.btn1);
        botao2 = (Button) findViewById(R.id.btn2);
        botao3 = (Button) findViewById(R.id.btn3);
        botao4 = (Button) findViewById(R.id.btn4);
        botao5 = (Button) findViewById(R.id.btn5);
        botao6 = (Button) findViewById(R.id.btn6);

        botaoProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
