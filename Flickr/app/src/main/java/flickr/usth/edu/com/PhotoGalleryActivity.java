package flickr.usth.edu.com;

import android.support.v4.app.Fragment;

import  flickr.usth.edu.com.Fragment.PhotoGalleryFragment;
import  flickr.usth.edu.com.Fragment.SingleFragmentActivity;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment(){
        return PhotoGalleryFragment.newInstance();
    }
}
