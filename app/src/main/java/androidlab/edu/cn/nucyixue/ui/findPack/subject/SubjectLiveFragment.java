package androidlab.edu.cn.nucyixue.ui.findPack.subject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import androidlab.edu.cn.nucyixue.R;
import androidlab.edu.cn.nucyixue.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SubjectLiveFragment extends BaseFragment {

    private static final String TAG = "SubjectLiveFragment";

    public  static SubjectLiveFragment getInstance() {
        // Required empty public constructor
        return new SubjectLiveFragment();
    }


    @Override
    protected void init(View mView, Bundle mSavedInstanceState) {

    }

    @Override
    protected int getResourcesLayout() {
        return R.layout.fragment_subject_live;
    }

    @Override
    protected void logic() {

    }

}
