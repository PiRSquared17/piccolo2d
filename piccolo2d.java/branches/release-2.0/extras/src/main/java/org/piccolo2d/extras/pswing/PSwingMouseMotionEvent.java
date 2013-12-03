/*
 * Copyright (c) 2008-2011, Piccolo2D project, http://piccolo2d.org
 * Copyright (c) 1998-2008, University of Maryland
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided
 * that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of conditions
 * and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions
 * and the following disclaimer in the documentation and/or other materials provided with the
 * distribution.
 *
 * None of the name of the University of Maryland, the name of the Piccolo2D project, or the names of its
 * contributors may be used to endorse or promote products derived from this software without specific
 * prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.piccolo2d.extras.pswing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import org.piccolo2d.event.PInputEvent;


/**
 * <b>PMouseMotionEvent</b> is an event which indicates that a mouse motion
 * action occurred in a node.
 * <p>
 * This low-level event is generated by a node object for:
 * <ul>
 * <li>Mouse Motion Events
 * <ul>
 * <li>the mouse is moved
 * <li>the mouse is dragged
 * </ul>
 * </ul>
 * </p>
 * <p>
 * A PMouseEvent object is passed to every <code>PMouseMotionListener</code> or
 * <code>PMouseMotionAdapter</code> object which registered to receive mouse
 * motion events using the component's <code>addMouseMotionListener</code>
 * method. (<code>PMouseMotionAdapter</code> objects implement the
 * <code>PMouseMotionListener</code> interface.) Each such listener object gets
 * a <code>PMouseEvent</code> containing the mouse motion event.
 * </p>
 * <p>
 * <b>Warning:</b> Serialized objects of this class will not be compatible with
 * future Piccolo releases. The current serialization support is appropriate for
 * short term storage or RMI between applications running the same version of
 * Piccolo. A future release of Piccolo will provide support for long term
 * persistence.
 * </p>
 * 
 * @author Benjamin B. Bederson
 * @author Sam R. Reid
 * @author Lance E. Good
 */
public class PSwingMouseMotionEvent extends PSwingMouseEvent {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new PMouse event from a Java MouseEvent.
     * 
     * @param id The event type (MOUSE_MOVED, MOUSE_DRAGGED)
     * @param swingEvent The original Java mouse event when in MOUSE_DRAGGED events
     * @param piccoloEvent Piccolo2d event to use when querying about the event's
     *            piccolo2d context
     */
    protected PSwingMouseMotionEvent(final int id, final MouseEvent swingEvent, final PInputEvent piccoloEvent) {
        super(id, swingEvent, piccoloEvent);
    }

    /**
     * Calls appropriate method on the listener based on this events ID.
     * 
     * @param listener the target for dispatch.
     */
    public void dispatchTo(final Object listener) {
        final MouseMotionListener mouseMotionListener = (MouseMotionListener) listener;
        switch (getID()) {
            case MouseEvent.MOUSE_DRAGGED:
                mouseMotionListener.mouseDragged(this);
                break;
            case MouseEvent.MOUSE_MOVED:
                mouseMotionListener.mouseMoved(this);
                break;
            default:
                throw new RuntimeException("PMouseMotionEvent with bad ID");
        }
    }

}