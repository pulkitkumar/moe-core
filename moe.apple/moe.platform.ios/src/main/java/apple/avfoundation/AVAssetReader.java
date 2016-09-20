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

package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetReader extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetReader(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetReader alloc();

    /**
     * assetReaderWithAsset:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetReader_Class/index.html#//apple_ref/occ/clm/AVAssetReader/assetReaderWithAsset:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("assetReaderWithAsset:error:")
    public static native AVAssetReader assetReaderWithAssetError(AVAsset asset, Ptr<NSError> outError);

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * addOutput:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetReader_Class/index.html#//apple_ref/occ/instm/AVAssetReader/addOutput:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addOutput:")
    public native void addOutput(AVAssetReaderOutput output);

    /**
     * asset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetReader_Class/index.html#//apple_ref/occ/instp/AVAssetReader/asset">iOS Dev Center</a>
     */
    @Generated
    @Selector("asset")
    public native AVAsset asset();

    /**
     * canAddOutput:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetReader_Class/index.html#//apple_ref/occ/instm/AVAssetReader/canAddOutput:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canAddOutput:")
    public native boolean canAddOutput(AVAssetReaderOutput output);

    /**
     * cancelReading</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetReader_Class/index.html#//apple_ref/occ/instm/AVAssetReader/cancelReading">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelReading")
    public native void cancelReading();

    /**
     * error</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetReader_Class/index.html#//apple_ref/occ/instp/AVAssetReader/error">iOS Dev Center</a>
     */
    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("init")
    public native AVAssetReader init();

    /**
     * initWithAsset:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetReader_Class/index.html#//apple_ref/occ/instm/AVAssetReader/initWithAsset:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithAsset:error:")
    public native AVAssetReader initWithAssetError(AVAsset asset, Ptr<NSError> outError);

    /**
     * outputs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetReader_Class/index.html#//apple_ref/occ/instp/AVAssetReader/outputs">iOS Dev Center</a>
     */
    @Generated
    @Selector("outputs")
    public native NSArray<? extends AVAssetReaderOutput> outputs();

    /**
     * timeRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetReader_Class/index.html#//apple_ref/occ/instp/AVAssetReader/timeRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTimeRange:")
    public native void setTimeRange(@ByValue CMTimeRange value);

    /**
     * startReading</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetReader_Class/index.html#//apple_ref/occ/instm/AVAssetReader/startReading">iOS Dev Center</a>
     */
    @Generated
    @Selector("startReading")
    public native boolean startReading();

    /**
     * status</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetReader_Class/index.html#//apple_ref/occ/instp/AVAssetReader/status">iOS Dev Center</a>
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    /**
     * timeRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetReader_Class/index.html#//apple_ref/occ/instp/AVAssetReader/timeRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeRange")
    @ByValue
    public native CMTimeRange timeRange();
}
