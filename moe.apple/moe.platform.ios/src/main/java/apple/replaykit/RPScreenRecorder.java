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

package apple.replaykit;

import apple.NSObject;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.replaykit.protocol.RPScreenRecorderDelegate;
import apple.uikit.UIView;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("ReplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class RPScreenRecorder extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected RPScreenRecorder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native RPScreenRecorder alloc();

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
    @Selector("sharedRecorder")
    public static native RPScreenRecorder sharedRecorder();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("cameraPreviewView")
    public native UIView cameraPreviewView();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native RPScreenRecorderDelegate delegate();

    @Generated
    @Selector("discardRecordingWithHandler:")
    public native void discardRecordingWithHandler(
            @ObjCBlock(name = "call_discardRecordingWithHandler") Block_discardRecordingWithHandler handler);

    @Generated
    @Selector("init")
    public native RPScreenRecorder init();

    @Generated
    @Selector("isAvailable")
    public native boolean isAvailable();

    @Generated
    @Selector("isCameraEnabled")
    public native boolean isCameraEnabled();

    @Generated
    @Selector("setCameraEnabled:")
    public native void setCameraEnabled(boolean value);

    @Generated
    @Selector("isMicrophoneEnabled")
    public native boolean isMicrophoneEnabled();

    @Generated
    @Selector("setMicrophoneEnabled:")
    public native void setMicrophoneEnabled(boolean value);

    @Generated
    @Selector("isRecording")
    public native boolean isRecording();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) RPScreenRecorderDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) RPScreenRecorderDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("startRecordingWithHandler:")
    public native void startRecordingWithHandler(
            @ObjCBlock(name = "call_startRecordingWithHandler") Block_startRecordingWithHandler handler);

    @Generated
    @Selector("startRecordingWithMicrophoneEnabled:handler:")
    public native void startRecordingWithMicrophoneEnabledHandler(boolean microphoneEnabled,
            @ObjCBlock(name = "call_startRecordingWithMicrophoneEnabledHandler") Block_startRecordingWithMicrophoneEnabledHandler handler);

    @Generated
    @Selector("stopRecordingWithHandler:")
    public native void stopRecordingWithHandler(
            @ObjCBlock(name = "call_stopRecordingWithHandler") Block_stopRecordingWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discardRecordingWithHandler {
        @Generated
        void call_discardRecordingWithHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startRecordingWithHandler {
        @Generated
        void call_startRecordingWithHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startRecordingWithMicrophoneEnabledHandler {
        @Generated
        void call_startRecordingWithMicrophoneEnabledHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopRecordingWithHandler {
        @Generated
        void call_stopRecordingWithHandler(RPPreviewViewController arg0, NSError arg1);
    }

    @Generated
    @Selector("cameraPosition")
    @NInt
    public native long cameraPosition();

    @Generated
    @Selector("setCameraPosition:")
    public native void setCameraPosition(@NInt long value);

    @Generated
    @Selector("startCaptureWithHandler:completionHandler:")
    public native void startCaptureWithHandlerCompletionHandler(
            @ObjCBlock(name = "call_startCaptureWithHandlerCompletionHandler_0") Block_startCaptureWithHandlerCompletionHandler_0 captureHandler,
            @ObjCBlock(name = "call_startCaptureWithHandlerCompletionHandler_1") Block_startCaptureWithHandlerCompletionHandler_1 completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startCaptureWithHandlerCompletionHandler_0 {
        @Generated
        void call_startCaptureWithHandlerCompletionHandler_0(CMSampleBufferRef arg0, @NInt long arg1, NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startCaptureWithHandlerCompletionHandler_1 {
        @Generated
        void call_startCaptureWithHandlerCompletionHandler_1(NSError arg0);
    }

    @Generated
    @Selector("stopCaptureWithHandler:")
    public native void stopCaptureWithHandler(
            @ObjCBlock(name = "call_stopCaptureWithHandler") Block_stopCaptureWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopCaptureWithHandler {
        @Generated
        void call_stopCaptureWithHandler(NSError arg0);
    }
}
