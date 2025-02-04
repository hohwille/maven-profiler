/**
 * Copyright (c) 2012 to original author or authors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package io.tesla.lifecycle.profiler;

import io.tesla.lifecycle.profiler.internal.DefaultTimer;

public abstract class AbstractTimerProfile extends AbstractProfile {

  protected final Timer timer;

  protected AbstractTimerProfile() {
    this.timer = new DefaultTimer();
  }

  public void stop() {
    timer.stop();
  }

  @Override
  public long getElapsedTime() {
    if(elapsedTime != 0) {
      return elapsedTime;
    }
    return timer.getElapsedTime();
  }

}
