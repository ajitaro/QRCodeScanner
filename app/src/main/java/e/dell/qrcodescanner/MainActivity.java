package e.dell.qrcodescanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTakePicture, btnScanBarcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        btnTakePicture = findViewById(R.id.btnScan);
        btnScanBarcode = findViewById(R.id.btnScan2);
        btnTakePicture.setOnClickListener(this);
        btnScanBarcode.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnScan:
                startActivity(new Intent(MainActivity.this, QRScan.class));
                break;
            case R.id.btnScan2:
                startActivity(new Intent(MainActivity.this, QRScan.class));
                break;
        }

    }
}