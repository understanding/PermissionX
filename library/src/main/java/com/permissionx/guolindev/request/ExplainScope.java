/*
 * Copyright (C)  guolin, PermissionX Open Source Project
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

package com.permissionx.guolindev.request;

import android.app.Dialog;
import android.view.View;

import java.util.List;

/**
 * Provide specific scopes for {@link com.permissionx.guolindev.callback.ExplainReasonCallback} and {@link com.permissionx.guolindev.callback.ExplainReasonCallbackWithBeforeParam} to give it specific functions to call.
 * @author guolin
 * @since 2020/3/18
 */
public class ExplainScope {

    private PermissionBuilder pb;

    private ChainTask chainTask;

    ExplainScope(PermissionBuilder pb, ChainTask chainTask) {
        this.pb = pb;
        this.chainTask = chainTask;
    }

    /**
     * Show a rationale dialog to explain to user why you need these permissions.
     * @param permissions
     *          Permissions that to request.
     * @param message
     *          Message that show to user.
     * @param positiveText
     *          Text on the positive button. When user click, PermissionX will request permissions again.
     * @param negativeText
     *          Text on the negative button. When user click, PermissionX will finish request.
     */
    public void showRequestReasonDialog(List<String> permissions, String message, String positiveText, String negativeText) {
        pb.showHandlePermissionDialog(chainTask, true, permissions, message, positiveText, negativeText);
    }

    /**
     * Show a rationale dialog to explain to user why you need these permissions.
     * @param permissions
     *          Permissions that to request.
     * @param message
     *          Message that show to user.
     * @param positiveText
     *          Text on the positive button. When user click, PermissionX will request permissions again.
     */
    public void showRequestReasonDialog(List<String> permissions, String message, String positiveText) {
        showRequestReasonDialog(permissions, message, positiveText, null);
    }

    /**
     * Show a rationale dialog to explain to user why you need these permissions.
     * @param permissions
     *          Permissions that to request.
     * @param dialog
     *          Dialog to explain to user why these permissions are necessary.
     * @param positiveButton
     *          Positive button on the dialog. When user click, PermissionX will request permissions again.
     * @param negativeButton
     *          Negative button on the dialog. When user click, PermissionX will finish request.
     */
    public void showRequestReasonDialog(List<String> permissions, Dialog dialog, View positiveButton, View negativeButton) {
        pb.showHandlePermissionDialog(chainTask, true, permissions, dialog, positiveButton, negativeButton);
    }

    /**
     * Show a rationale dialog to explain to user why you need these permissions.
     * @param permissions
     *          Permissions that to request.
     * @param dialog
     *          Dialog to explain to user why these permissions are necessary.
     * @param positiveButton
     *          Positive button on the dialog. When user click, PermissionX will request permissions again.
     */
    public void showRequestReasonDialog(List<String> permissions, Dialog dialog, View positiveButton) {
        showRequestReasonDialog(permissions, dialog, positiveButton, null);
    }

}