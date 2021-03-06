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

package apple.cloudkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("CloudKit")
@Runtime(CRuntime.class)
public final class CloudKit {
    static {
        NatJ.register();
    }

    @Generated
    private CloudKit() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKCurrentUserDefaultName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKOwnerDefaultName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKAccountChangedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKPartialErrorsByItemIDKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordChangedErrorAncestorRecordKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordChangedErrorServerRecordKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordChangedErrorClientRecordKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKErrorRetryAfterKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordTypeUserRecord();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordParentKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordShareKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordZoneDefaultName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordTypeShare();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKShareTitleKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKShareThumbnailImageDataKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKShareTypeKey();

    @Generated
    @CVariable()
    @NUInt
    public static native long CKQueryOperationMaximumResults();
}
