package caracoroa.cursoandroid.com.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {
    private ImageView caraCoroa;
    private ImageView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        caraCoroa = (ImageView) findViewById(R.id.caraCoroa);
        Bundle extra = getIntent().getExtras();
        if(extra != null){
            String opcaoEscolhida = extra.getString("opcao");
            if(opcaoEscolhida.equals("cara"))
                setCara(caraCoroa);
            else
                setCoroa(caraCoroa);

        }

        voltar = (ImageView) findViewById(R.id.btnVoltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    protected void setCara(ImageView imagem){
        imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
    }

    protected void setCoroa(ImageView imagem){
        imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
    }
}
