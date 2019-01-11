package com.mapbox.services.android.navigation.ui.v5.camera;

import com.mapbox.mapboxsdk.location.modes.CameraMode;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class NavigationCameraTransitionListenerTest {

  @Test
  public void onLocationCameraTransitionFinished() {
    NavigationCamera camera = mock(NavigationCamera.class);
    NavigationCameraTransitionListener listener = new NavigationCameraTransitionListener(camera);

    listener.onLocationCameraTransitionFinished(CameraMode.TRACKING_GPS);

    verify(camera).updateTransitionListenersFinished();
  }

  @Test
  public void onLocationCameraTransitionCanceled() {
    NavigationCamera camera = mock(NavigationCamera.class);
    NavigationCameraTransitionListener listener = new NavigationCameraTransitionListener(camera);

    listener.onLocationCameraTransitionCanceled(CameraMode.TRACKING_GPS);

    verify(camera).updateTransitionListenersCancelled();
  }
}