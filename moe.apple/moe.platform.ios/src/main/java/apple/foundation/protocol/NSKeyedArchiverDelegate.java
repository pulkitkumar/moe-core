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

package apple.foundation.protocol;

import apple.foundation.NSKeyedArchiver;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSKeyedArchiverDelegate")
public interface NSKeyedArchiverDelegate {
    /**
     * archiver:didEncodeObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSKeyedArchiverDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSKeyedArchiverDelegate/archiver:didEncodeObject:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("archiver:didEncodeObject:")
    default void archiverDidEncodeObject(NSKeyedArchiver archiver, @Mapped(ObjCObjectMapper.class) Object object) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * archiver:willEncodeObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSKeyedArchiverDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSKeyedArchiverDelegate/archiver:willEncodeObject:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("archiver:willEncodeObject:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object archiverWillEncodeObject(NSKeyedArchiver archiver, @Mapped(ObjCObjectMapper.class) Object object) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * archiver:willReplaceObject:withObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSKeyedArchiverDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSKeyedArchiverDelegate/archiver:willReplaceObject:withObject:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("archiver:willReplaceObject:withObject:")
    default void archiverWillReplaceObjectWithObject(NSKeyedArchiver archiver,
            @Mapped(ObjCObjectMapper.class) Object object, @Mapped(ObjCObjectMapper.class) Object newObject) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * archiverDidFinish:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSKeyedArchiverDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSKeyedArchiverDelegate/archiverDidFinish:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("archiverDidFinish:")
    default void archiverDidFinish(NSKeyedArchiver archiver) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * archiverWillFinish:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSKeyedArchiverDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSKeyedArchiverDelegate/archiverWillFinish:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("archiverWillFinish:")
    default void archiverWillFinish(NSKeyedArchiver archiver) {
        throw new java.lang.UnsupportedOperationException();
    }
}