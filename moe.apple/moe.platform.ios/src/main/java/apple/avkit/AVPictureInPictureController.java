/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.avkit;

import apple.NSObject;
import apple.avfoundation.AVPlayerLayer;
import apple.avkit.protocol.AVPictureInPictureControllerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIImage;
import apple.uikit.UITraitCollection;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPictureInPictureController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPictureInPictureController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPictureInPictureController alloc();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVKit/Reference/AVPictureInPictureController_Class/index.html#//apple_ref/occ/instp/AVPictureInPictureController/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVPictureInPictureControllerDelegate delegate();

    @Generated
    @Selector("init")
    public native AVPictureInPictureController init();

    /**
     * initWithPlayerLayer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVKit/Reference/AVPictureInPictureController_Class/index.html#//apple_ref/occ/instm/AVPictureInPictureController/initWithPlayerLayer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithPlayerLayer:")
    public native AVPictureInPictureController initWithPlayerLayer(AVPlayerLayer playerLayer);

    /**
     * pictureInPictureActive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVKit/Reference/AVPictureInPictureController_Class/index.html#//apple_ref/occ/instp/AVPictureInPictureController/pictureInPictureActive">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPictureInPictureActive")
    public native boolean isPictureInPictureActive();

    /**
     * pictureInPicturePossible</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVKit/Reference/AVPictureInPictureController_Class/index.html#//apple_ref/occ/instp/AVPictureInPictureController/pictureInPicturePossible">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPictureInPicturePossible")
    public native boolean isPictureInPicturePossible();

    /**
     * isPictureInPictureSupported</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVKit/Reference/AVPictureInPictureController_Class/index.html#//apple_ref/occ/clm/AVPictureInPictureController/isPictureInPictureSupported">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPictureInPictureSupported")
    public static native boolean isPictureInPictureSupported();

    /**
     * pictureInPictureSuspended</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVKit/Reference/AVPictureInPictureController_Class/index.html#//apple_ref/occ/instp/AVPictureInPictureController/pictureInPictureSuspended">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPictureInPictureSuspended")
    public native boolean isPictureInPictureSuspended();

    @Generated
    @Selector("pictureInPictureButtonStartImageCompatibleWithTraitCollection:")
    public static native UIImage pictureInPictureButtonStartImageCompatibleWithTraitCollection(
            UITraitCollection traitCollection);

    @Generated
    @Selector("pictureInPictureButtonStopImageCompatibleWithTraitCollection:")
    public static native UIImage pictureInPictureButtonStopImageCompatibleWithTraitCollection(
            UITraitCollection traitCollection);

    /**
     * playerLayer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVKit/Reference/AVPictureInPictureController_Class/index.html#//apple_ref/occ/instp/AVPictureInPictureController/playerLayer">iOS Dev Center</a>
     */
    @Generated
    @Selector("playerLayer")
    public native AVPlayerLayer playerLayer();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVKit/Reference/AVPictureInPictureController_Class/index.html#//apple_ref/occ/instp/AVPictureInPictureController/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) AVPictureInPictureControllerDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVKit/Reference/AVPictureInPictureController_Class/index.html#//apple_ref/occ/instp/AVPictureInPictureController/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) AVPictureInPictureControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * startPictureInPicture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVKit/Reference/AVPictureInPictureController_Class/index.html#//apple_ref/occ/instm/AVPictureInPictureController/startPictureInPicture">iOS Dev Center</a>
     */
    @Generated
    @Selector("startPictureInPicture")
    public native void startPictureInPicture();

    /**
     * stopPictureInPicture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVKit/Reference/AVPictureInPictureController_Class/index.html#//apple_ref/occ/instm/AVPictureInPictureController/stopPictureInPicture">iOS Dev Center</a>
     */
    @Generated
    @Selector("stopPictureInPicture")
    public native void stopPictureInPicture();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
