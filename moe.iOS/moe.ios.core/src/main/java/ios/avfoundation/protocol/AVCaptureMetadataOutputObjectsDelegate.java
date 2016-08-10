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

package ios.avfoundation.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.avfoundation.AVCaptureConnection;
import ios.avfoundation.AVCaptureOutput;
import ios.foundation.NSArray;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCaptureMetadataOutputObjectsDelegate")
public interface AVCaptureMetadataOutputObjectsDelegate {
	/**
	 * captureOutput:didOutputMetadataObjects:fromConnection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureMetadataOutputObjectsDelegate_Protocol/index.html#//apple_ref/occ/intfm/AVCaptureMetadataOutputObjectsDelegate/captureOutput:didOutputMetadataObjects:fromConnection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("captureOutput:didOutputMetadataObjects:fromConnection:")
	default void captureOutputDidOutputMetadataObjectsFromConnection(
			AVCaptureOutput captureOutput, NSArray<?> metadataObjects,
			AVCaptureConnection connection) {
		throw new java.lang.UnsupportedOperationException();
	}
}