package flickr.usth.edu.com;

import android.support.v4.app.Fragment;

import huy.photogallery.Fragment.PhotoGalleryFragment;
import huy.photogallery.Fragment.SingleFragmentActivity;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment(){
        return PhotoGalleryFragment.newInstance();
    }
}