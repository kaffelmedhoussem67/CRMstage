import { TestBed } from '@angular/core/testing';

import { SocieteRegService } from './societe-reg.service';

describe('SocieteRegService', () => {
  let service: SocieteRegService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SocieteRegService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
