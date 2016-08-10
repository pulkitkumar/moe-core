/*
 * Copyright (c) 2014-2016, Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ios.quartzcore;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.coregraphics.opaque.CGPathRef;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSNumber;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAKeyframeAnimation extends CAPropertyAnimation {
	static {
		NatJ.register();
	}

	@Generated
	protected CAKeyframeAnimation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CAKeyframeAnimation alloc();

	@Generated
	@Selector("animation")
	public static native CAKeyframeAnimation animation();

	@Generated
	@Selector("animationWithKeyPath:")
	public static native CAKeyframeAnimation animationWithKeyPath(String path);

	/**
	 * biasValues</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/biasValues">iOS Dev Center</a>
	 */
	@Generated
	@Selector("biasValues")
	public native NSArray<? extends NSNumber> biasValues();

	/**
	 * calculationMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/calculationMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("calculationMode")
	public native String calculationMode();

	/**
	 * continuityValues</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/continuityValues">iOS Dev Center</a>
	 */
	@Generated
	@Selector("continuityValues")
	public native NSArray<? extends NSNumber> continuityValues();

	@Generated
	@Selector("init")
	public native CAKeyframeAnimation init();

	/**
	 * keyTimes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/keyTimes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("keyTimes")
	public native NSArray<? extends NSNumber> keyTimes();

	/**
	 * path</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/path">iOS Dev Center</a>
	 */
	@Generated
	@Selector("path")
	public native CGPathRef path();

	/**
	 * rotationMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/rotationMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rotationMode")
	public native String rotationMode();

	/**
	 * biasValues</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/biasValues">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBiasValues:")
	public native void setBiasValues(NSArray<? extends NSNumber> value);

	/**
	 * calculationMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/calculationMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCalculationMode:")
	public native void setCalculationMode(String value);

	/**
	 * continuityValues</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/continuityValues">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContinuityValues:")
	public native void setContinuityValues(NSArray<? extends NSNumber> value);

	/**
	 * keyTimes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/keyTimes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setKeyTimes:")
	public native void setKeyTimes(NSArray<? extends NSNumber> value);

	/**
	 * path</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/path">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPath:")
	public native void setPath(CGPathRef value);

	/**
	 * rotationMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/rotationMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRotationMode:")
	public native void setRotationMode(String value);

	/**
	 * tensionValues</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/tensionValues">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTensionValues:")
	public native void setTensionValues(NSArray<? extends NSNumber> value);

	/**
	 * timingFunctions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/timingFunctions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTimingFunctions:")
	public native void setTimingFunctions(NSArray<? extends CAMediaTimingFunction> value);

	/**
	 * values</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/values">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setValues:")
	public native void setValues(NSArray<?> value);

	/**
	 * tensionValues</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/tensionValues">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tensionValues")
	public native NSArray<? extends NSNumber> tensionValues();

	/**
	 * timingFunctions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/timingFunctions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timingFunctions")
	public native NSArray<? extends CAMediaTimingFunction> timingFunctions();

	/**
	 * values</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAKeyframeAnimation_class/index.html#//apple_ref/occ/instp/CAKeyframeAnimation/values">iOS Dev Center</a>
	 */
	@Generated
	@Selector("values")
	public native NSArray<?> values();

	@Generated
	@Selector("initWithCoder:")
	public native CAKeyframeAnimation initWithCoder(NSCoder aDecoder);

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	@Selector("defaultValueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultValueForKey(String key);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
}