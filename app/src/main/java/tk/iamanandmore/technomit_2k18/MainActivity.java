package tk.iamanandmore.technomit_2k18;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
    public void event1(View view){
        Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSelFxhQsUKbz3Btp2gg1BY4hwChT6sHpuNL0QMmgJL7Z9O47g/viewform");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void event2(View view){
        Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdgW0IFzDfEAM6ka7jnNDChUsAFgKNpHtDvXZlCNmlWpA9-NQ/viewform");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void event3(View view){
        Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSd3whr28tEjcYhmblhmXxvudDUkGxdLpt6nPz-USp-LEzGcQw/viewform");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void event4(View view){
        Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSd5ETF3Dw38WiUzGxb811Dzt79zFpUeb_I1uG1uosna5Baoeg/viewform");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void event5(View view){
        Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSeUEUmO1nV4PIXCvDazqZObBTXpBMHRF2oZ6NczRrzJDA2Xog/viewform");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void event6(View view){
        Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdWg7LbLHfPlwqyJ2dhFR0OGSlr7o-2qpyyB5_MSrHpB8ZqZw/viewform");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void event7(View view){
        Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdlqbyfNd1bsNqPw9pK4cii6FheN9I4RfIEpJMvabdxIKDszQ/viewform");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void event8(View view){
        Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSf0cwRLeSWN1y6xK7Xylh5pGDAb65bO90P1M0UMVSMzbYG1sQ/viewform");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void event9(View view){
        Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdk9iIrzKtCjucSRBA-Rff2Taz33nV-OxAOde4gTH10QvBc6g/viewform");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void event10(View view){
        Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSelFxhQsUKbz3Btp2gg1BY4hwChT6sHpuNL0QMmgJL7Z9O47g/viewform");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void event11(View view){
        Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdYUyF37B2kGAe1FqQ-Usrj5FMjrFam5nz7aqsb23M3ukupGg/viewform");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}