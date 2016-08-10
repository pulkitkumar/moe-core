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

package ios.eventkitui.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.eventkitui.EKCalendarChooser;

@Generated
@Library("EventKitUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("EKCalendarChooserDelegate")
public interface EKCalendarChooserDelegate {
	/**
	 * calendarChooserDidCancel:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKitUI/Reference/EKCalendarChooserDelegateProtocolRef/index.html#//apple_ref/occ/intfm/EKCalendarChooserDelegate/calendarChooserDidCancel:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("calendarChooserDidCancel:")
	default void calendarChooserDidCancel(
			EKCalendarChooser calendarChooser) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * calendarChooserDidFinish:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKitUI/Reference/EKCalendarChooserDelegateProtocolRef/index.html#//apple_ref/occ/intfm/EKCalendarChooserDelegate/calendarChooserDidFinish:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("calendarChooserDidFinish:")
	default void calendarChooserDidFinish(
			EKCalendarChooser calendarChooser) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * calendarChooserSelectionDidChange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKitUI/Reference/EKCalendarChooserDelegateProtocolRef/index.html#//apple_ref/occ/intfm/EKCalendarChooserDelegate/calendarChooserSelectionDidChange:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("calendarChooserSelectionDidChange:")
	default void calendarChooserSelectionDidChange(
			EKCalendarChooser calendarChooser) {
		throw new java.lang.UnsupportedOperationException();
	}
}