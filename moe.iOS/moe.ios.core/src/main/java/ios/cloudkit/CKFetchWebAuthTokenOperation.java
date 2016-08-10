package ios.cloudkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import ios.foundation.NSError;
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
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKFetchWebAuthTokenOperation extends CKDatabaseOperation {
	static {
		NatJ.register();
	}

	@Generated
	protected CKFetchWebAuthTokenOperation(Pointer peer) {
		super(peer);
	}

	/**
	 * APIToken</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchWebAuthTokenOperation_class/index.html#//apple_ref/occ/instp/CKFetchWebAuthTokenOperation/APIToken">iOS Dev Center</a>
	 */
	@Generated
	@Selector("APIToken")
	public native String APIToken();

	@Generated
	@Owned
	@Selector("alloc")
	public static native CKFetchWebAuthTokenOperation alloc();

	/**
	 * fetchWebAuthTokenCompletionBlock</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchWebAuthTokenOperation_class/index.html#//apple_ref/occ/instp/CKFetchWebAuthTokenOperation/fetchWebAuthTokenCompletionBlock">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchWebAuthTokenCompletionBlock")
	@ObjCBlock(name = "call_fetchWebAuthTokenCompletionBlock_ret")
	public native Block_fetchWebAuthTokenCompletionBlock_ret fetchWebAuthTokenCompletionBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchWebAuthTokenCompletionBlock_ret {
		@Generated
		void call_fetchWebAuthTokenCompletionBlock_ret(String arg0, NSError arg1);
	}

	@Generated
	@Selector("init")
	public native CKFetchWebAuthTokenOperation init();

	/**
	 * initWithAPIToken:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchWebAuthTokenOperation_class/index.html#//apple_ref/occ/instm/CKFetchWebAuthTokenOperation/initWithAPIToken:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithAPIToken:")
	public native CKFetchWebAuthTokenOperation initWithAPIToken(String APIToken);

	/**
	 * APIToken</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchWebAuthTokenOperation_class/index.html#//apple_ref/occ/instp/CKFetchWebAuthTokenOperation/APIToken">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAPIToken:")
	public native void setAPIToken(String value);

	/**
	 * fetchWebAuthTokenCompletionBlock</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchWebAuthTokenOperation_class/index.html#//apple_ref/occ/instp/CKFetchWebAuthTokenOperation/fetchWebAuthTokenCompletionBlock">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFetchWebAuthTokenCompletionBlock:")
	public native void setFetchWebAuthTokenCompletionBlock(
			@ObjCBlock(name = "call_setFetchWebAuthTokenCompletionBlock") Block_setFetchWebAuthTokenCompletionBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setFetchWebAuthTokenCompletionBlock {
		@Generated
		void call_setFetchWebAuthTokenCompletionBlock(String arg0, NSError arg1);
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