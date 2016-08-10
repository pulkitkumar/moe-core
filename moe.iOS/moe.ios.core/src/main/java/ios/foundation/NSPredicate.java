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

package ios.foundation;


import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPredicate extends NSObject implements NSSecureCoding, NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPredicate(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPredicate alloc();

	/**
	 * allowEvaluation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPredicate_Class/index.html#//apple_ref/occ/instm/NSPredicate/allowEvaluation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowEvaluation")
	public native void allowEvaluation();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * evaluateWithObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPredicate_Class/index.html#//apple_ref/occ/instm/NSPredicate/evaluateWithObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("evaluateWithObject:")
	public native boolean evaluateWithObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	/**
	 * evaluateWithObject:substitutionVariables:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPredicate_Class/index.html#//apple_ref/occ/instm/NSPredicate/evaluateWithObject:substitutionVariables:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("evaluateWithObject:substitutionVariables:")
	public native boolean evaluateWithObjectSubstitutionVariables(
			@Mapped(ObjCObjectMapper.class) Object object, NSDictionary<String, ?> bindings);

	@Generated
	@Selector("init")
	public native NSPredicate init();

	@Generated
	@Selector("initWithCoder:")
	public native NSPredicate initWithCoder(NSCoder aDecoder);

	/**
	 * predicateFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPredicate_Class/index.html#//apple_ref/occ/instp/NSPredicate/predicateFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateFormat")
	public native String predicateFormat();

	/**
	 * predicateWithBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPredicate_Class/index.html#//apple_ref/occ/clm/NSPredicate/predicateWithBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateWithBlock:")
	public static native NSPredicate predicateWithBlock(
			@ObjCBlock(name = "call_predicateWithBlock") Block_predicateWithBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_predicateWithBlock {
		@Generated
		boolean call_predicateWithBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, NSDictionary<String, ?> arg1);
	}

	/**
	 * predicateWithFormat:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPredicate_Class/index.html#//apple_ref/occ/clm/NSPredicate/predicateWithFormat:">iOS Dev Center</a>
	 */
	@Generated
	@Variadic()
	@Selector("predicateWithFormat:")
	public static native NSPredicate predicateWithFormat(
			String predicateFormat, Object... varargs);

	/**
	 * predicateWithFormat:argumentArray:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPredicate_Class/index.html#//apple_ref/occ/clm/NSPredicate/predicateWithFormat:argumentArray:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateWithFormat:argumentArray:")
	public static native NSPredicate predicateWithFormatArgumentArray(
			String predicateFormat, NSArray<?> arguments);

	/**
	 * predicateWithFormat:arguments:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPredicate_Class/index.html#//apple_ref/occ/clm/NSPredicate/predicateWithFormat:arguments:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateWithFormat:arguments:")
	public static native NSPredicate predicateWithFormatArguments(
			String predicateFormat, BytePtr argList);

	/**
	 * predicateWithSubstitutionVariables:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPredicate_Class/index.html#//apple_ref/occ/instm/NSPredicate/predicateWithSubstitutionVariables:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateWithSubstitutionVariables:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object predicateWithSubstitutionVariables(
			NSDictionary<String, ?> variables);

	/**
	 * predicateWithValue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPredicate_Class/index.html#//apple_ref/occ/clm/NSPredicate/predicateWithValue:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateWithValue:")
	public static native NSPredicate predicateWithValue(boolean value);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

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