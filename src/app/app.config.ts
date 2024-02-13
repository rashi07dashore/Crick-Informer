import { ApplicationConfig } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { provideClientHydration } from '@angular/platform-browser';
import { provideHttpClient } from '@angular/common/http';

export const appConfig: ApplicationConfig = {
  //routing done(from app.routes.ts)
  //provides Router
  providers: [provideHttpClient(),provideRouter(routes), provideClientHydration()]
};
