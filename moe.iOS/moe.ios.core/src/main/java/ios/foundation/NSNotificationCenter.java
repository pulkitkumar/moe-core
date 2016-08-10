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


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSNotificationCenter extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSNotificationCenter(Pointer peer) {
		super(peer);
	}

	/**
	 * addObserver:selector:name:object:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNotificationCenter_Class/index.html#//apple_ref/occ/instm/NSNotificationCenter/addObserver:selector:name:object:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addObserver:selector:name:object:")
	public native void addObserverSelectorNameObject(
			@Mapped(ObjCObjectMapper.class) Object observer, SEL aSelector,
			String aName, @Mapped(ObjCObjectMapper.class) Object anObject);

	/**
	 * addObserverForName:object:queue:usingBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNotificationCenter_Class/index.html#//apple_ref/occ/instm/NSNotificationCenter/addObserverForName:object:queue:usingBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addObserverForName:object:queue:usingBlock:")
	@MappedReturn(ObjCObjectMapper.class)
	public native ios.protocol.NSObject addObserverForNameObjectQueueUsingBlock(
			String name,
			@Mapped(ObjCObjectMapper.class) Object obj,
			NSOperationQueue queue,
			@ObjCBlock(name = "call_addObserverForNameObjectQueueUsingBlock") Block_addObserverForNameObjectQueueUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_addObserverForNameObjectQueueUsingBlock {
		@Generated
		void call_addObserverForNameObjectQueueUsingBlock(
				NSNotification arg0);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSNotificationCenter alloc();

	/**
	 * defaultCenter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNotificationCenter_Class/index.html#//apple_ref/occ/clm/NSNotificationCenter/defaultCenter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultCenter")
	public static native NSNotificationCenter defaultCenter();

	@Generated
	@Selector("init")
	public native NSNotificationCenter init();

	/**
	 * postNotification:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNotificationCenter_Class/index.html#//apple_ref/occ/instm/NSNotificationCenter/postNotification:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("postNotification:")
	public native void postNotification(NSNotification notification);

	/**
	 * postNotificationName:object:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNotificationCenter_Class/index.html#//apple_ref/occ/instm/NSNotificationCenter/postNotificationName:object:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("postNotificationName:object:")
	public native void postNotificationNameObject(String aName,
			@Mapped(ObjCObjectMapper.class) Object anObject);

	/**
	 * postNotificationName:object:userInfo:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNotificationCenter_Class/index.html#//apple_ref/occ/instm/NSNotificationCenter/postNotificationName:object:userInfo:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("postNotificationName:object:userInfo:")
	public native void postNotificationNameObjectUserInfo(String aName,
			@Mapped(ObjCObjectMapper.class) Object anObject,
			NSDictionary<?, ?> aUserInfo);

	/**
	 * removeObserver:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNotificationCenter_Class/index.html#//apple_ref/occ/instm/NSNotificationCenter/removeObserver:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObserver:")
	public native void removeObserver(
			@Mapped(ObjCObjectMapper.class) Object observer);

	/**
	 * removeObserver:name:object:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNotificationCenter_Class/index.html#//apple_ref/occ/instm/NSNotificationCenter/removeObserver:name:object:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObserver:name:object:")
	public native void removeObserverNameObject(
			@Mapped(ObjCObjectMapper.class) Object observer, String aName,
			@Mapped(ObjCObjectMapper.class) Object anObject);

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
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}