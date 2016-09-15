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

package apple.foundation;

import apple.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
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
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableSet<_ObjectType> extends NSSet<_ObjectType> {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableSet(Pointer peer) {
        super(peer);
    }

    /**
     * addObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableSet_Class/index.html#//apple_ref/occ/instm/NSMutableSet/addObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addObject:")
    public native void addObject(@Mapped(ObjCObjectMapper.class) _ObjectType object);

    /**
     * addObjectsFromArray:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableSet_Class/index.html#//apple_ref/occ/instm/NSMutableSet/addObjectsFromArray:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addObjectsFromArray:")
    public native void addObjectsFromArray(NSArray<_ObjectType> array);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableSet<?> alloc();

    /**
     * filterUsingPredicate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableSet_Class/index.html#//apple_ref/occ/instm/NSMutableSet/filterUsingPredicate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("filterUsingPredicate:")
    public native void filterUsingPredicate(NSPredicate predicate);

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableSet_Class/index.html#//apple_ref/occ/instm/NSMutableSet/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSMutableSet<?> init();

    @Generated
    @Selector("initWithArray:")
    public native NSMutableSet<?> initWithArray(NSArray<_ObjectType> array);

    /**
     * initWithCapacity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableSet_Class/index.html#//apple_ref/occ/instm/NSMutableSet/initWithCapacity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithCapacity:")
    public native NSMutableSet<?> initWithCapacity(@NUInt long numItems);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableSet<?> initWithCoder(NSCoder aDecoder);

    @Generated
    @Variadic()
    @Selector("initWithObjects:")
    public native NSMutableSet<?> initWithObjects(@Mapped(ObjCObjectMapper.class) _ObjectType firstObj,
            Object... varargs);

    @Generated
    @Selector("initWithObjects:count:")
    public native NSMutableSet<?> initWithObjectsCount(ConstPtr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("initWithSet:")
    public native NSMutableSet<?> initWithSet(NSSet<_ObjectType> set);

    @Generated
    @Selector("initWithSet:copyItems:")
    public native NSMutableSet<?> initWithSetCopyItems(NSSet<_ObjectType> set, boolean flag);

    /**
     * intersectSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableSet_Class/index.html#//apple_ref/occ/instm/NSMutableSet/intersectSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("intersectSet:")
    public native void intersectSet(NSSet<_ObjectType> otherSet);

    /**
     * minusSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableSet_Class/index.html#//apple_ref/occ/instm/NSMutableSet/minusSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("minusSet:")
    public native void minusSet(NSSet<_ObjectType> otherSet);

    /**
     * removeAllObjects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableSet_Class/index.html#//apple_ref/occ/instm/NSMutableSet/removeAllObjects">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllObjects")
    public native void removeAllObjects();

    /**
     * removeObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableSet_Class/index.html#//apple_ref/occ/instm/NSMutableSet/removeObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObject:")
    public native void removeObject(@Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Selector("set")
    public static native <_ObjectType> NSMutableSet<?> set();

    /**
     * setSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableSet_Class/index.html#//apple_ref/occ/instm/NSMutableSet/setSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSet:")
    public native void setSet(NSSet<_ObjectType> otherSet);

    @Generated
    @Selector("setWithArray:")
    public static native <_ObjectType> NSMutableSet<?> setWithArray(NSArray<_ObjectType> array);

    /**
     * setWithCapacity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableSet_Class/index.html#//apple_ref/occ/clm/NSMutableSet/setWithCapacity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWithCapacity:")
    public static native <_ObjectType> NSMutableSet<?> setWithCapacity(@NUInt long numItems);

    @Generated
    @Selector("setWithObject:")
    public static native <_ObjectType> NSMutableSet<?> setWithObject(
            @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Variadic()
    @Selector("setWithObjects:")
    public static native <_ObjectType> NSMutableSet<?> setWithObjects(
            @Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

    @Generated
    @Selector("setWithObjects:count:")
    public static native <_ObjectType> NSMutableSet<?> setWithObjectsCount(ConstPtr<_ObjectType> objects,
            @NUInt long cnt);

    @Generated
    @Selector("setWithSet:")
    public static native <_ObjectType> NSMutableSet<?> setWithSet(NSSet<_ObjectType> set);

    /**
     * unionSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableSet_Class/index.html#//apple_ref/occ/instm/NSMutableSet/unionSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("unionSet:")
    public native void unionSet(NSSet<_ObjectType> otherSet);

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
