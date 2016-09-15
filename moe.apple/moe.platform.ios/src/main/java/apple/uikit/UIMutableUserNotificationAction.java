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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIMutableUserNotificationAction extends UIUserNotificationAction {
    static {
        NatJ.register();
    }

    @Generated
    protected UIMutableUserNotificationAction(Pointer peer) {
        super(peer);
    }

    /**
     * activationMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/activationMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("activationMode")
    @NUInt
    public native long activationMode();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIMutableUserNotificationAction alloc();

    /**
     * identifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/identifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native UIMutableUserNotificationAction init();

    /**
     * authenticationRequired</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/authenticationRequired">iOS Dev Center</a>
     */
    @Generated
    @Selector("isAuthenticationRequired")
    public native boolean isAuthenticationRequired();

    /**
     * destructive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/destructive">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDestructive")
    public native boolean isDestructive();

    /**
     * activationMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/activationMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setActivationMode:")
    public native void setActivationMode(@NUInt long value);

    /**
     * authenticationRequired</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/authenticationRequired">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAuthenticationRequired:")
    public native void setAuthenticationRequired(boolean value);

    /**
     * destructive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/destructive">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDestructive:")
    public native void setDestructive(boolean value);

    /**
     * identifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/identifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    /**
     * title</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/title">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * title</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/title">iOS Dev Center</a>
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * behavior</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/behavior">iOS Dev Center</a>
     */
    @Generated
    @Selector("behavior")
    @NUInt
    public native long behavior();

    @Generated
    @Selector("initWithCoder:")
    public native UIMutableUserNotificationAction initWithCoder(NSCoder aDecoder);

    /**
     * parameters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/parameters">iOS Dev Center</a>
     */
    @Generated
    @Selector("parameters")
    public native NSDictionary<?, ?> parameters();

    /**
     * behavior</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/behavior">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBehavior:")
    public native void setBehavior(@NUInt long value);

    /**
     * parameters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIMutableUserNotificationAction_class/index.html#//apple_ref/occ/instp/UIMutableUserNotificationAction/parameters">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParameters:")
    public native void setParameters(NSDictionary<?, ?> value);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}